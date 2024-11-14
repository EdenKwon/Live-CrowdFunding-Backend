package com.crofle.livecrowdfunding.controller;

import com.crofle.livecrowdfunding.dto.ProjectLikedResponseDTO;
import com.crofle.livecrowdfunding.dto.request.LikedRequestDTO;
import com.crofle.livecrowdfunding.service.LikedService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/liked")
@Log4j2
public class LikedController {

    private final LikedService likedService;

    @PostMapping
    public ResponseEntity<Boolean> toggleLike(@RequestBody LikedRequestDTO likedRequestDTO) {
        return ResponseEntity.ok().body(likedService.toggleLike(likedRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ProjectLikedResponseDTO>> getUserLike(@PathVariable Long id) {
        return ResponseEntity.ok().body(likedService.getUserLikedProjects(id));
    }

}