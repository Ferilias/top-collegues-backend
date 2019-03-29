package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Collegues;
import dev.top.entities.Version;
import dev.top.repos.ColleguesRepo;
import dev.top.repos.VersionRepo;

@Component
public class StartupDataInit {

	@Autowired
	VersionRepo versionRepo;

	@Autowired
	ColleguesRepo colleguesrepo;

	@EventListener(ContextRefreshedEvent.class)
	public void init() {

		this.versionRepo.save(new Version("v1"));
		this.versionRepo.save(new Version("v2"));
		this.versionRepo.save(new Version("v3"));
		this.versionRepo.save(new Version("v4"));

		this.colleguesrepo.save(
				new Collegues("Alexandre", 500, "http://image.noelshack.com/fichiers/2018/21/1/1526927277-lama.jpg"));
		this.colleguesrepo.save(new Collegues("Yoann", 500,
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFpf4QOB2LE_9_TgQjRYNcjjMKRwpwh2LczYPH77Yy1xuydG-PvQ"));
		this.colleguesrepo.save(new Collegues("Youcef", 400, "https://i.ytimg.com/vi/xv_R-hNynEg/maxresdefault.jpg"));
		this.colleguesrepo.save(new Collegues("Mel", 300,
				"https://www.santevet.com/upload/admin/images/article/Chat%202/actualit%C3%A9s/le%20chaton%20teint%20en%20rose%20d'Elena%20Lenina.jpeg"));
		this.colleguesrepo.save(new Collegues("Melanie", -500,
				"https://www.sciencemag.org/sites/default/files/styles/inline__450w__no_aspect/public/panda_16x9.jpg?itok=8a0-7WSj"));
		this.colleguesrepo.save(new Collegues("Aniss", 500, "https://i.skyrock.net/0764/35930764/pics/1757069784.jpg"));

	}
}
