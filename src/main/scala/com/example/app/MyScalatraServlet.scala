package com.example.app

import org.scalatra._

class MyScalatraServlet extends AppiliciousStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  get("/meme") {
    <p>Yay Yay! I like memes</p>
  }


}
