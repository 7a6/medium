package main_test

import (
	. "github.com/7a6/medium"
	. "github.com/onsi/ginkgo"
	"net/http"
	"net/http/httptest"
)

var _ = Describe("Server", func() {

	var server http.Server

	BeforeEach(func() {

		server = httptest.NewServer(HandleAvatar)

	})
	Context("when the user has an avatar", func() {
		It("can serve an avatar", func() {
			//	Expect
		})
	})
})
