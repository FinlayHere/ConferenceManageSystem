package code.repo;

import code.accessor.Accessor;
import code.entity.CmsEntity;
import code.entity.Paper;

import java.util.Comparator;
import java.util.List;

public class PaperRepository implements Repository<Paper> {
		
		private static final Accessor<Paper> PAPER_ACCESSOR = new Accessor<>(CmsEntity.PAPER);
		private static List<Paper> papers = PAPER_ACCESSOR.loadAll();
		private static PaperRepository instance = null;
		
		private PaperRepository() {
		
		}
		
		public static PaperRepository getInstance() {
				if (null == instance) {
						instance = new PaperRepository();
				}
				return instance;
		}
		
		
		@Override
		public List<Paper> findAll() {
				papers = PAPER_ACCESSOR.loadAll();
				
				return papers;
		}
		
		@Override
		public void addOne(Paper paper) {
				papers.add(paper);
				PAPER_ACCESSOR.saveAll(papers);
				papers = PAPER_ACCESSOR.loadAll();
		}
		
		@Override
		public Integer generateMaxId() {
				
				return papers.stream()
						.max(Comparator.comparingInt(Paper::getId))
						.get()
						.getId();
		}
		
		@Override
		public void retrieveAll() {
				papers.forEach(paper -> {
						System.out.println(paper.getEntityLine());
				});
		}
}
