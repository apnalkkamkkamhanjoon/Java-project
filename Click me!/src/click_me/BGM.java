package click_me;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class BGM {
	// 메인화면 브금
	public BGM() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(Start.class.getResource("../BGM/BGM3.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
			
			// 소리 설정
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			
			// 볼륨 조절
			gainControl.setValue(-10.0f);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
