package org.pedro.animes.entity.services;

import java.util.List;
import java.util.Optional;

import org.pedro.animes.entity.dao.IAnimeDao;
import org.pedro.animes.entity.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeServiceImpl implements IAnimeService {

	@Autowired
	IAnimeDao animeDao;
	
	@Override
	public List<Anime> getAll() {
		return (List<Anime>) animeDao.findAll();
	}

	@Override
	public Optional<Anime> getOne(long idAnime) {
		return animeDao.findById(idAnime);
	}

	@Override
	public void add(Anime anime) {
		animeDao.save(anime);
		
	}

	@Override
	public void delete(long idAnime) {
		animeDao.deleteById(idAnime);
		
	}

	@Override
	public void update(Anime anime, long idAnime) {
		// TODO Auto-generated method stub
		
	}

}
