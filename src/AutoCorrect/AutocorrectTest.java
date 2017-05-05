package AutoCorrect;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AutocorrectTest {
	@Test
	public void testApply() {
		String[] inputs = new String[] { "u", "you", "youuuuu", "youtube" };

		String[] outputs = new String[] { "your sister", "your sister", "your sister", "youtube" };

		for (int i = 0; i < inputs.length; i++) {
			assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i], Kata.autocorrect(inputs[i]));
		}
	}


		@Test
		public void testApply2() {
			String[] inputs = new String[] { "I wanna hang with u", "you want to hang out?", "youuuuu is the best!",
					"Youtube is the best" };

			String[] outputs = new String[] { "I wanna hang with your sister", "your sister want to hang out?",
					"your sister is the best!", "Youtube is the best" };

			for (int i = 0; i < inputs.length; i++) {
				assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i],
						Kata.autocorrect(inputs[i]));
			}
		}
	
}
