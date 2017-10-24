package main

import (
	"encoding/json"
	"fmt"
	"io"
	"io/ioutil"
	"net/http"
	"os"
	"strconv"
	"html/template"
)

func uploadHandler(w http.ResponseWriter, r *http.Request) {
	if checkCookie(w, r) {
		r.ParseMultipartForm(1000000)
		file, handler, err := r.FormFile("uploadfile")
		if err != nil {
			fmt.Println(err)
			return
		}
		defer file.Close()
		fmt.Fprintf(w, "%v", handler.Header)
		f, err := os.OpenFile("./static/"+handler.Filename, os.O_WRONLY|os.O_CREATE, 0666)
		if err != nil {
			fmt.Println(err)
			return
		}
		defer f.Close()
		io.Copy(f, file)

		/*
			content := readAPI()

			place := r.FormValue("fil")

			if place == "Logo" {
				content.Logo = place
			}else if */
		key := r.FormValue("fil")
		i, _ := strconv.Atoi(key)

		updateBilde(i, handler.Filename)

	} else { //restricted access
		http.Error(w, "Invalid User, try logging in again", http.StatusBadRequest)
	}

	http.Redirect(w, r, "/admin/hjem", 200)
}

func updateBilde(i int, name string) {
	content := readAPI()

	content.Bilde[i] = name

	contentJSON, _ := json.Marshal(content)
	_ = ioutil.WriteFile("web/content.json", contentJSON, 0644)

	updateDB(content)

}

func uploadHeaderHandler(w http.ResponseWriter, r *http.Request) {
	r.ParseForm()
	header := r.FormValue("header")
	key := r.FormValue("key")
	content := readAPI()

	i, _ := strconv.Atoi(key)

	content.Heading[i] = template.HTML(header)
	//	content.Heading1 = header
	contentJSON, _ := json.Marshal(content)

	_ = ioutil.WriteFile("web/content.json", contentJSON, 0644)

	updateDB(content)

	http.Redirect(w, r, "/admin/hjem", 200)
}

func uploadBodyHandler(w http.ResponseWriter, r *http.Request) {
	r.ParseForm()
	body := r.FormValue("body")
	key := r.FormValue("key")
	content := readAPI()

	i, _ := strconv.Atoi(key)

	content.Body[i] = template.HTML(body)
	contentJSON, _ := json.Marshal(content)

	_ = ioutil.WriteFile("web/content.json", contentJSON, 0644)

	updateDB(content)

	http.Redirect(w, r, "/admin/hjem", 200)
}
