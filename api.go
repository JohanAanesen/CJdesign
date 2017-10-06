package main

import (
	"encoding/json"
	"fmt"
	"io"
	"net/http"
	"os"
	"html/template"
)

/*
--Hjem--
Karusell:
	Bilde1
	Bilde2
	Bilde3

3 små unnder:
	Bilde4
	Heading1
	Body1
	Bilde5
	Heading2
	Body2
	Bilde6
	Heading3
	Body3

3 Features
	Bilde7
	Heading4
	Body4
	Bilde8
	Heading5
	Body5
	Bilde9
	Heading6
	Body6


Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.


*/
type Content struct {
	//	Logo		string 	`json:"logo"`
	Bilde []string `json:"bilde"`

	Heading []template.HTML `json:"heading"`

	//Body []string `json:"body"`
	Body []template.HTML `json:"body"`
}

/*
func fillContentHardCode(content Content) Content {
//	content.Bilde = []string{"logo.png", "header.jpg", "header.jpg", "header.jpg", "insta1.jpg", "insta2.jpg", "insta3.jpg", "insta1.jpg", "insta2.jpg", "insta3.jpg"}

//	content.Heading = []string{"Header", "Header", "Header", "Header", "Header", "Header"}

//	content.Body = []string{"Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.", "test", "test", "test", "test", "test", "kontakt info"}

	return content
}
*/

func apiHandler(w http.ResponseWriter, r *http.Request) {
	/*	var content Content
		content = fillContentHardCode(content)

		json.NewEncoder(w).Encode(content)*/
	json1, err := os.Open("web/content.json")
	if err != nil {
		fmt.Printf("Error reading content.json: %s", err)
		os.Exit(1)
	}

	content, err := decodeAPI(json1)

	if err != nil {
		fmt.Printf("Error reading content.json: %s", err)
		os.Exit(1)
	}

	json.NewEncoder(w).Encode(content)

	//json.Encoder(w).Encode(json1)
}

func readAPI() Content {
	json1, err := os.Open("web/content.json")
	if err != nil {
		fmt.Printf("Error reading content.json: %s", err)
		os.Exit(1)
	}

	content, err := decodeAPI(json1)

	if err != nil {
		fmt.Printf("Error reading content.json: %s", err)
		os.Exit(1)
	}

	return content
}

func decodeAPI(r io.Reader) (Content, error) {
	var content Content

	err := json.NewDecoder(r).Decode(&content)
	if err != nil {
		fmt.Printf("Error with json decoder: %s", err)
		os.Exit(1)
	}

	return content, nil
}
