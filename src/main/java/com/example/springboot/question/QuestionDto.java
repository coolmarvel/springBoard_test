package com.example.springboot.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.example.springboot.answer.AnswerDto;
import com.example.springboot.user.SiteUserDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDto {
    private Integer id;
    private String subject;
    private String content;
    private LocalDateTime createDate;
    private List<AnswerDto> answerList;
    private SiteUserDto author;
    private LocalDateTime modifyDate;
    private Set<SiteUserDto> voter;
}
