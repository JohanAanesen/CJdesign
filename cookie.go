package main

import (
	"fmt"
	"net/http"
	"time"
)

func setCookie(w http.ResponseWriter, s string) {
	expiration := time.Now().Add(365 * 24 * time.Hour)
	cookie := http.Cookie{Name: "username", Value: s, Expires: expiration}
	http.SetCookie(w, &cookie)
}

func deleteCookie(w http.ResponseWriter, r *http.Request) {
	cookie, err := r.Cookie("username")
	if err != nil {
		fmt.Printf("shit: %s", err)
		return
	}
	cookie.MaxAge = -1
	http.SetCookie(w, cookie)
}

func checkCookie(w http.ResponseWriter, r *http.Request) bool {
	cookie, err := r.Cookie("username")
	if err != nil {
		fmt.Printf("shit: %s", err)
		return false
	}
	if cookie.Value == "johan" {
		return true
	} else {
		return false
	}
}
