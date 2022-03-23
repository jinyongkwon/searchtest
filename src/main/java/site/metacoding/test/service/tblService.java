package site.metacoding.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.test.domain.boardTbl;
import site.metacoding.test.domain.tblRepository;

@RequiredArgsConstructor
@Service
public class tblService {

    private final tblRepository tblRepository;

    public List<boardTbl> 게시글찾기(String search) {
        List<boardTbl> tblEntity = tblRepository.mfindSearch(search);
        return tblEntity;
    }
}
