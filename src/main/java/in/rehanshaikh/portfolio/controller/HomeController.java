package in.rehanshaikh.portfolio.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/download-resume")
    public ResponseEntity<Resource> downloadResume() {
        Resource resource = new ClassPathResource("static/assets/files/Rehan.pdf");
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"rehan_resume.pdf\"")
                .body(resource);
    }

    @GetMapping({"/", "/home"})
    public String showHomePage(Model model)
    {
        model.addAttribute("title","Home");
        return "master";
    }

    @GetMapping({"/projects"})
    public String showProjectPage(Model model)
    {
        model.addAttribute("title","Projects");
        return "master";
    }

    @GetMapping({"/resume"})
    public String showResumePage(Model model)
    {
        model.addAttribute("title","Resume");
        return "master";
    }

    @GetMapping({"/contact"})
    public String showContactPage(Model model)
    {
        model.addAttribute("title","Contact");
        return "master";
    }

    @GetMapping({"/me"})
    public String showMePage(Model model)
    {
        model.addAttribute("title","me");
        return "master";
    }
}