package code.repo;

import code.accessor.Accessor;
import code.entity.CmsEntity;
import code.entity.Conference;

import java.util.List;

public class ConferenceRepository implements Repository<Conference> {
    private static final Accessor<Conference> CONFERENCE_ACCESSOR = new Accessor<>(CmsEntity.CONFERENCE);
    private static List<Conference> conferences = CONFERENCE_ACCESSOR.loadAll();
    private static ConferenceRepository instance = null;

    private ConferenceRepository() {

    }

    public static ConferenceRepository getInstance() {
        if (null == instance) {
            instance = new ConferenceRepository();
        }
        return instance;
    }

    @Override
    public List<Conference> findAll() {
        conferences = CONFERENCE_ACCESSOR.loadAll();
        return conferences;
    }

    @Override
    public void addOne(Conference conference) {
        conferences.add(conference);
        CONFERENCE_ACCESSOR.saveAll(conferences);
        conferences = CONFERENCE_ACCESSOR.loadAll();
    }

    @Override
    public Integer generateMaxId() {
        return null;
    }

    @Override
    public void retrieveAll() {
        conferences.forEach(conference -> {
            System.out.println(conference.getEntityLine());
        });
    }
}
