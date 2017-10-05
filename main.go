package main

import (
	"html/template"
	"log"
	"net/http"
	"os"
)

func homeHandler(w http.ResponseWriter, r *http.Request) {
	temp, err := template.ParseFiles("web/index.gtpl")
	if err != nil {
		log.Fatal(err)
	}

	var content Content

	//content = fillContent(content)
	content = readAPI()

	temp.Execute(w, content)
}

func adminHandler(w http.ResponseWriter, r *http.Request) {
	r.ParseForm()
	name := r.FormValue("username")
	pw := r.FormValue("password")

	if checkCookie(w, r) {
		t, _ := template.ParseFiles("web/admin.gtpl")
		t.Execute(w, nil)
	} else if name == "johan" && pw == "123" {
		//set cookie
		setCookie(w, name)

		t, _ := template.ParseFiles("web/admin.gtpl")
		t.Execute(w, nil)
	} else {
		http.Error(w, "Invalid User, try logging in again", http.StatusBadRequest)
	}
}

func loginHandler(w http.ResponseWriter, r *http.Request) {
	if checkCookie(w, r) {
		http.Redirect(w, r, "/admin", 200)
	} else {
		t, _ := template.ParseFiles("web/login.gtpl")
		t.Execute(w, nil)
	}
}

func portefoljeHandler(w http.ResponseWriter, r *http.Request) {
	t, _ := template.ParseFiles("web/portefolje.gtpl")
	t.Execute(w, nil)
}

func kontaktHandler(w http.ResponseWriter, r *http.Request) {
	t, _ := template.ParseFiles("web/kontakt.gtpl")
	var content Content

	//content = fillContent(content)
	content = readAPI()

	t.Execute(w, content)
	//	t.Execute(w, nil)
}

func adminHjemHandler(w http.ResponseWriter, r *http.Request) {
	executeAdmin(w, r, "adminHjem")
}

/*
func adminPortefoljeHandler(w http.ResponseWriter, r *http.Request){
	executeAdmin(w, r, "adminPortefolje")
}
func adminKontaktHandler(w http.ResponseWriter, r *http.Request){
	executeAdmin(w, r, "adminKontakt")
}*/

func executeAdmin(w http.ResponseWriter, r *http.Request, s string) {
	//checks if there is a cookie
	if checkCookie(w, r) {
		t, err := template.ParseFiles("web/settings/" + s + ".gtpl")
		if err != nil {
			print(err)
		}
		var content Content
		//content = fillContent(content)
		content = readAPI()
		t.Execute(w, content)
		//t.Execute(w, nil)
	} else { //restricted access
		http.Error(w, "Invalid User, try logging in again", http.StatusBadRequest)
	}
}

func logoutHandler(w http.ResponseWriter, r *http.Request) {
	deleteCookie(w, r)

	http.Redirect(w, r, "/", 200)
}

func main() {
	http.HandleFunc("/", homeHandler)
	http.HandleFunc("/api", apiHandler)
	http.HandleFunc("/login", loginHandler)
	http.HandleFunc("/portefolje", portefoljeHandler)
	http.HandleFunc("/kontakt", kontaktHandler)
	http.HandleFunc("/admin", adminHandler)
	http.HandleFunc("/admin/hjem", adminHjemHandler)
	http.HandleFunc("/logout", logoutHandler)
	http.HandleFunc("/upload", uploadHandler)
	http.HandleFunc("/uploadheader", uploadHeaderHandler)
	http.HandleFunc("/uploadbody", uploadBodyHandler)

	http.Handle("/static/", http.StripPrefix("/static/", http.FileServer(http.Dir("static"))))
	//	http.Handle("/css/", http.StripPrefix("/css/", http.FileServer(http.Dir("css"))))

	port := os.Getenv("PORT")

		http.ListenAndServe(":"+port, nil)
	//http.ListenAndServe(":8080", nil)
}
