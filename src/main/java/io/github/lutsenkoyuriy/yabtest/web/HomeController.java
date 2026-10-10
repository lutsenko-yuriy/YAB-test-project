package io.github.lutsenkoyuriy.yabtest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private static final String ALIVE_MESSAGE = "I am somehow alive! Thank you, Yuriy's agentic boyz!";

  // text/plain renders as black-on-white with no markup; explicit UTF-8 keeps the apostrophe intact.
  @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
  public String home() {
    return ALIVE_MESSAGE;
  }
}
