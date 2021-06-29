package locations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DistanceServiceTest {

    @Mock
    LocRepository repository;

    @InjectMocks
    DistanceService distanceService;

    @Test
    void testCalculateDistance() {
//        LocRepository repository = mock(LocRepository.class);
//        DistanceService distanceService = new DistanceService(repository);

        assertEquals(Optional.empty(), distanceService.calculateDistance("lkj", "lkdl"));

        verify(repository, times(2)).findByName(any());
    }

    @Test
    
}