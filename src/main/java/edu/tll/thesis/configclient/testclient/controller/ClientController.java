package edu.tll.thesis.configclient.testclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {
  @Value("${db-username}")
  private String dbUsername;

  @Value("${contentful-username}")
  private String contentfulUsername;

  @GetMapping("/db")
  public String showDbUserName() {
    return "The db username is: " + dbUsername;
  }


  @GetMapping("/contentful")
  public String showContentFulUserName() {
    return "The contentful username is: " + contentfulUsername;
  }

}
