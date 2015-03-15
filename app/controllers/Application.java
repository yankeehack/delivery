package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.basic;
import views.html.carousel;

public class Application extends Controller {
  public static Result basic() {
    return ok(basic.render("Your new application is ready."));
  }
  public static Result withDropDown(){
    return ok(carousel.render("rolling man is ready"));
  }

}
