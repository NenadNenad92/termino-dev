package at.bmdw.teamtermino.termino.jpa;

import at.bmdw.teamtermino.termino.entity.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MeetingRepository extends JpaRepository<Meeting, UUID> {

    List<Meeting> findByTitle(String title);

}
