package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Favorite;
import com.mezereon.springtest.dao.FavoriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {
    @Autowired
    FavoriteMapper favoriteMapper;

    public List<Favorite> selectFavoriteByCustomerId(int customerId) {
        return favoriteMapper.selectFavoriteByCustomerId(customerId);
    }

    public void deleteFavorite(Favorite favorite) {
        favorite.setfStatus(0);
        favoriteMapper.updateByPrimaryKey(favorite);
    }

    public void addFavorite(Favorite favorite) {
        favoriteMapper.insert(favorite);
    }
}
