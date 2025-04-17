package com.college.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Category;
import com.college.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    public Category update(Category category) {
        return categoryRepository.save(category);
    }
}