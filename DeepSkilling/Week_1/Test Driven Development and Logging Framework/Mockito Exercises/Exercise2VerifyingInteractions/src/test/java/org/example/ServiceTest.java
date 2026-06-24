package org.example;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {
    @Test
    public void testSendNotification() {
        Service mockService = mock(Service.class);
        mockService.sendNotification("Hello User");
        verify(mockService).sendNotification("Hello User");
    }
}