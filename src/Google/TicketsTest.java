package Google;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketsTest {
Tickets ticket = new Tickets();

	@Test
	public void test() {
		assertEquals(30,ticket.buyTickets());
	}

}
