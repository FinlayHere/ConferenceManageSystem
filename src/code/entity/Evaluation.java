package code.entity;

public class Evaluation {
		
		private Integer id;
		private Integer paperId;
		private Integer reviewerId;
		private Integer score;
		
		public Evaluation() {
		}
		
		public Evaluation(Integer id, Integer paperId, Integer reviewerId, Integer score) {
				this.id = id;
				this.paperId = paperId;
				this.reviewerId = reviewerId;
				this.score = score;
		}
		
		public Integer getId() {
				return id;
		}
		
		public void setId(Integer id) {
				this.id = id;
		}
		
		public Integer getPaperId() {
				return paperId;
		}
		
		public void setPaperId(Integer paperId) {
				this.paperId = paperId;
		}
		
		public Integer getReviewerId() {
				return reviewerId;
		}
		
		public void setReviewerId(Integer reviewerId) {
				this.reviewerId = reviewerId;
		}
		
		public Integer getScore() {
				return score;
		}
		
		public void setScore(Integer score) {
				this.score = score;
		}
		
}
