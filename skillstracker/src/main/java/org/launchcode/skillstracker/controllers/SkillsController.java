package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String skillTracker() {
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return html;
    }

    @GetMapping ("form")
    @ResponseBody
    public String skillForm() {
        String form = "<html>" +
                "<body>" +
                "<form method = 'post' action = '/submitform'>" +
                "<label for= 'name'> What's your name? </label>"+
                "<input type='text' name='name'>" +
                "<br>" +
                " <label for='languages1'>My favorite Language:</label>" +
                "<select name='languages1' id='languages1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "</select>" +
                "<br>" +
                " <label for='languages2'>My second favorite Language:</label>" +
                "<select name='languages2'id='languages2'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Java'>Java</option>" +
                "</select>" +
                "<br>" +
                "<label for='languages3'>My third favorite Language:</label>" +
                "<select name='languages3' id='languages3'>" +
                "<option value='C++'>C++</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "</select>" +
                "<input type='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

        return form;
    }

    @PostMapping("/submitform")
    @ResponseBody
    public String processForm(
            @RequestParam String name,
            @RequestParam String languages1,
            @RequestParam String languages2,
            @RequestParam String languages3) {

        String submitted= "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + languages1 + "</li>" +
                "<li>" + languages2 + "</li>" +
                "<li>" + languages3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return submitted;

    }
}




