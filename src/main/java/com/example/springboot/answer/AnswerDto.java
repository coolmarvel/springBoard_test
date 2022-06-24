package com.example.springboot.answer;

import java.time.LocalDateTime;
import java.util.Set;

import com.example.springboot.question.QuestionDto;
import com.example.springboot.user.SiteUserDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerDto {
    private Integer id;
    private String content;
    private LocalDateTime createDate;
    private QuestionDto question;
    private SiteUserDto author;
    private LocalDateTime modifyDate;
    private Set<SiteUserDto> voter;
}
