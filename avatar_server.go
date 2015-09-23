package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
)

type Avatar struct {
	Email    []string
	Password string
}

func main() {
	server := http.Server{
		Addr: "192.168.1.2:8080",
	}

	http.HandleFunc("/avatar/", HandleAvatar)
	server.ListenAndServe()
}

func HandleAvatar(w http.ResponseWriter, r *http.Request) {
	switch r.Method {
	case "GET":
		getAvatar(w, r)
	case "PUT":
		putAvatar(w, r)
	case "POST":
		postAvatar(w, r)
	case "DELETE":
		deleteAvatar(w, r)
	}
}

func getAvatar(w http.ResponseWriter, r *http.Request) {
	fmt.Println(r)
	b, err := ioutil.ReadFile("/home/matt/workspace/serve/images/" + r.URL.Path[len("/avatar/"):])
	if err != nil {
		w.Write([]byte("error"))
		return
	}
	w.Write(b)
}
func postAvatar(w http.ResponseWriter, r *http.Request) {
	w.Write([]byte("post"))

}
func putAvatar(w http.ResponseWriter, r *http.Request)    { w.Write([]byte("put")) }
func deleteAvatar(w http.ResponseWriter, r *http.Request) { w.Write([]byte("delete")) }
