package com.techtalentsouth.TechTalentTwitter2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.techtalentsouth.TechTalentTwitter2.model.Tweet;
import com.techtalentsouth.TechTalentTwitter2.service.TweetService;
import com.techtalentsouth.TechTalentTwitter2.service.UserService;

@Controller
public class TweetController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TweetService tweetService;
	
	@GetMapping(value= {"/tweets", "/"})
	public String getFeed(Model model){
	    List<Tweet> tweets = tweetService.findAll();
	    model.addAttribute("tweetList", tweets);
	    return "feed";
	}
	
	@GetMapping(value = "/tweets/new")
	public String getTweetForm(Model model) {
	    model.addAttribute("tweet", new Tweet());
	    return "newTweet";
	}
}
