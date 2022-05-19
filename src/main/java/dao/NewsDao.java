package dao;

import models.News;

import java.util.List;

public interface NewsDao {
    //create news
    void save(News news);

    //read news
    List<News> allNews();
    News findById(int id);
    List<News> allDepartmentNews(int deptId);

    void delete(int id);
    void deleteAll();
}
