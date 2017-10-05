package main

import (
	"encoding/json"
	"fmt"
	"io"
	"net/http"
	"os"
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
	/*	Bilde2		string	`json:"bilde2"`
		Bilde3		string	`json:"bilde3"`
		Bilde4		string	`json:"bilde4"`
		Bilde5		string	`json:"bilde5"`
		Bilde6		string	`json:"bilde6"`
		Bilde7		string	`json:"bilde7"`
		Bilde8		string	`json:"bilde8"`
		Bilde9		string	`json:"bilde9"`*/
	Heading []string `json:"heading"`
	/*	Heading2	string	`json:"heading2"`
		Heading3	string	`json:"heading3"`
		Heading4	string	`json:"heading4"`
		Heading5	string	`json:"heading5"`
		Heading6	string	`json:"heading6"`*/
	Body []string `json:"body"`
	/*	Body2		string	`json:"body2"`
		Body3		string	`json:"body3"`
		Body4		string	`json:"body4"`
		Body5		string	`json:"body5"`
		Body6		string	`json:"body6"` */
}
/*
func fillContentHardCode(content Content) Content {
	content.Bilde = []string{"logo.png", "header.jpg", "header.jpg", "header.jpg", "insta1.jpg", "insta2.jpg", "insta3.jpg", "insta1.jpg", "insta2.jpg", "insta3.jpg"}
	/*	content.Bilde2 = "bu.jpg"
		content.Bilde3 = "header.jpg"
		content.Bilde4 = "bu.jpg"
		content.Bilde5 = "bu.jpg"
		content.Bilde6 = "bu.jpg"
		content.Bilde7 = "insta1.jpg"
		content.Bilde8 = "insta2.jpg"
		content.Bilde9 = "insta3.jpg"*/
//	content.Heading = []string{"Header", "Header", "Header", "Header", "Header", "Header"}
	/*	content.Heading2 = "Header"
		content.Heading3 = "Header"
		content.Heading4 = "Header"
		content.Heading5 = "Header"
		content.Heading6 = "Header" */
//	content.Body = []string{"Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.", "test", "test", "test", "test", "test"}
	/*	content.Body2 = "Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo."
		content.Body3 = "Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo."
		content.Body4 = "Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo."
		content.Body5 = "Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo."
		content.Body6 = "Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo."
	*/
/*	return content
}
*/

func apiHandler(w http.ResponseWriter, r * http.Request) {
	/*	var content Content
		content = fillContentHardCode(content)

		json.NewEncoder(w).Encode(content)*/
	json1, err := os.Open("web/content.json")
	if err != nil {
		fmt.Printf("Error reading content.json: %s", err)
		os.Exit(1)
	}


	content, _ := decodeAPI(json1)

	json.NewEncoder(w).Encode(content)

	//json.Encoder(w).Encode(json1)
}

func readAPI() Content {
	json1, err := os.Open("web/content.json")
	if err != nil {
		fmt.Printf("Error reading content.json: %s", err)
		os.Exit(1)
	}

	content, _ := decodeAPI(json1)

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
