package plugin.enemydown.app2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.enemydown.app2.mapper.PlayerScoreMapper;
import plugin.enemydown.app2.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {

  @Autowired
  private PlayerScoreMapper mapper;

  public List<PlayerScore> searchPlayerScoreList() {
    return mapper.selectPlayerScoreList();
  }
}
