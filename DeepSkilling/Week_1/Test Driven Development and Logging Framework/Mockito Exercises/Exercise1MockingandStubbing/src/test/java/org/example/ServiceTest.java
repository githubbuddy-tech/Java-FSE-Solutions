package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ServiceTest {

    @Test
    public void testFetchData() {

        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        Service service = new Service(mockApi);
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}