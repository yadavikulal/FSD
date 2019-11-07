package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Image;

public class ImageServiceImpl implements ImageService{

	private ImageRepository imageRepository;
	
	@Override
	@Transactional
	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return imageRepository.findAll();
	}

	@Override
	@Transactional
	public void createImages(Image image) {
		// TODO Auto-generated method stub
		imageRepository.save(image);
	}

	@Override
	@Transactional
	public Optional<Image> getImageById(int theId) {
		// TODO Auto-generated method stub
		return imageRepository.findById(theId);
	}

}
