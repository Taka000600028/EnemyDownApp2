package plugin.enemydown.app2.mapper.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameConfig {

  private int id;
  private int gameTime;
  private String difficulty;

}
