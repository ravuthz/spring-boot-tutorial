package com.springboot.tutorial0.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    // GET List / Show
    // @RequestMapping(value = "/", method = RequestMethod.GET) alias to @GetMapping("/")
    @GetMapping("/posts")
    String listPost() {
        return "List Multiple Post";
    }

    @GetMapping("/posts/{id}")
    String viewPost(@PathVariable("id") long id) {
        return "View Single Post " + id;
    }

    // POST - Create
    // @RequestMapping(value = "/", method = RequestMethod.POST) alias to @PostMapping("/posts")
    @PostMapping("/posts")
    String createPost() {
        return "Create Post";
    }

    // PUT / PATCH - Update
    @PutMapping("/posts/{id}")
    // @RequestMapping(value = "/", method = RequestMethod.Put) alias to @PutMapping("/posts/{id}")
    String updatePost(@PathVariable("id") long id) {
        return "Update Post" + id;
    }

    // DELETE - Detele
    // @RequestMapping(value = "/", method = RequestMethod.Put) alias to @DeleteMapping("/posts/{id}")
    @DeleteMapping("/posts/{id}")
    String deletePost(@PathVariable("id") long id) {
        return "Delete Post" + id;
    }

}
