package code.entity;

import code.repo.ConferenceRepository;
import code.repo.PaperRepository;
import code.repo.UserRepository;

public class Admin extends User {
    private final PaperRepository paperRepository = PaperRepository.getInstance();
    private final UserRepository userRepository = UserRepository.getInstance();
    private final ConferenceRepository conferenceRepository = ConferenceRepository.getInstance();

    public String Im() {
        return "admin:" + getEmail();
    }

    public void retrievePaper() {
        paperRepository.retrieveAll();
    }

    public void retrieveUser() {
        userRepository.retrieveAll();
    }

    public void retrieveConference() {
        conferenceRepository.retrieveAll();
    }
}
