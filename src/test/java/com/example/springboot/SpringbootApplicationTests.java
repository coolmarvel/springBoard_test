package com.example.springboot;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.time.LocalDateTime;
// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.transaction.annotation.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	// 질문(Question) 데이터 생성
	// @Autowired
	// private QuestionRepository questionRepository;

	// 답변(Answer) 데이터 생성
	// @Autowired
	// private AnswerRepository answerRepository;

	// @Transactional
	@Test
	void testJpa() {
		// 데이터 추가하기
		// Question q1 = new Question();
		// q1.setSubject("sbb가 무엇인가요?");
		// q1.setContent("sbb에 대해서 알고 싶습니다.");
		// q1.setCreateDate(LocalDateTime.now());
		// this.questionRepository.save(q1); // 첫번째 질문 저장

		// Question q2 = new Question();
		// q2.setSubject("스프링부트 모델 질문입니다.");
		// q2.setContent("id는 자동으로 생성되나요?");
		// q2.setCreateDate(LocalDateTime.now());
		// this.questionRepository.save(q2); // 두번째 질문 저장

		// 데이터 수정하기
		// Optional<Question> oq = this.questionRepository.findById(1);
		// assertTrue(oq.isPresent()); // isPresent() -> 가져온 데이터가 null이 아닌지 확인
		// Question q = oq.get();
		// q.setSubject("수정된 제목");
		// this.questionRepository.save(q);

		// 데이터 조회하기
		// List<Question> all = this.questionRepository.findAll();
		// assertEquals(2, all.size());

		// Question q = all.get(0);
		// assertEquals("sbb가 무엇인가요?", q.getSubject());

		// Question q = this.questionRepository.findBySubjectAndContent(
		// "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
		// assertEquals(1, q.getId());

		// List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		// Question q = qList.get(0);
		// assertEquals("sbb가 무엇인가요?", q.getSubject());

		// 데이터 삭제하기
		// assertEquals(2, this.questionRepository.count());
		// Optional<Question> oq = this.questionRepository.findById(1);
		// assertTrue(oq.isPresent());
		// Question q = oq.get();
		// this.questionRepository.delete(q);
		// assertEquals(1, this.questionRepository.count());

		// 답변 데이터 저장하기
		// Optional<Question> oq = this.questionRepository.findById(2);
		// assertTrue(oq.isPresent());
		// Question q = oq.get();

		// Answer a = new Answer();
		// a.setContent("네 자동으로 생성됩니다.");
		// a.setQuestion(q); // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
		// a.setCreateDate(LocalDateTime.now());
		// this.answerRepository.save(a);

		// 답변 조회하기
		// Optional<Answer> oa = this.answerRepository.findById(1);
		// assertTrue(oa.isPresent());
		// Answer a = oa.get();
		// assertEquals(2, a.getQuestion().getId());

		// 답변에 연결된 질문 찾기 vs 질문에 달린 답변 찾기
		// Optional<Question> oq = this.questionRepository.findById(2);
		// assertTrue(oq.isPresent());
		// Question q = oq.get();

		// List<Answer> answerList = q.getAnswerList();

		// assertEquals(1, answerList.size());
		// assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}

}