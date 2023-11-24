package com.example.SpringSecuritySample.controller;

import com.example.SpringSecuritySample.model.Notice;
import com.example.SpringSecuritySample.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticesController {
    @Autowired
    private NoticeRepository noticeRepository;
    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNotices() {
        List<Notice> notices = noticeRepository.findAllActiveNotices();

        if (notices != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setCacheControl("max-age=60"); // Set cache control for 60 seconds
            return ResponseEntity.ok().headers(headers).body(notices);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
