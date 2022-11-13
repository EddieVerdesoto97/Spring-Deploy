package com.example.Spring.Deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Trabajar con JSON, @Controller vistas en html
public class HelloController {

    //@Value("${app.varexample}")
    //String message;
    //Acceder a la url
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo";
    }
    @GetMapping("/")
    public String bootstrap(){
        return "" +
                "<!doctype html>\n" +
                "<html lang=\"ar\" dir=\"rtl\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.rtl.min.css\" integrity=\"sha384-7mQhpDl5nRA5nY9lr8F1st2NbIly/8WqhjTp+0oFxEA/QUuvlbF6M1KXezGBh3Nb\" crossorigin=\"anonymous\">\n" +
                "\n" +
                "    <title>Deploy</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <h1>Hola Mundo</h1>\n" +
                "\n  <a class=\"btn btn-primary\" href=\"https://google.com\"> Google </a>" +
                "    <!-- Optional JavaScript; choose one of the two! -->\n" +
                "\n" +
                "    <!-- Option 1: Bootstrap Bundle with Popper -->\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\n" +
                "\n" +
                "    <!-- Option 2: Separate Popper and Bootstrap JS -->\n" +
                "    <!--\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\n" +
                "    -->\n" +
                "  </body>\n" +
                "</html>";
    }
}
