package main_test

import (
	. "github.com/7a6/medium"
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
	"net/http"
	"net/http/httptest"
)

var _ = Describe("Server", func() {

	var server *httptest.Server
	var recorder *httptest.ResponseRecorder
	var request *http.Request

	BeforeEach(func() {
		server = httptest.NewServer(http.HandlerFunc(HandleAvatar))
		server.URL = "192.168.1.2:8080"
		defer server.Close()
	})

	Describe("GET /avatar", func() {
		BeforeEach(func() {
			recorder = httptest.NewRecorder()

		})
		Context("when the user has an avatar", func() {
			It("can serve the avatar", func() {
				request, _ = http.NewRequest("GET", "/avatar/", nil)
				Expect(recorder.Code).To(Equal(200))
			})
		})
	})
})
