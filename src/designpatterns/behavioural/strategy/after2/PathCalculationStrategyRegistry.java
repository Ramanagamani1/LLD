package designpatterns.behavioural.strategy.after2;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {

    private Map<TransportMode,PathCalculationStrategy> strategies = new HashMap<>();

    public void register(TransportMode mode, PathCalculationStrategy pathCalculationStrategy) {
          strategies.put(mode,pathCalculationStrategy);
    }

    public PathCalculationStrategy get(TransportMode mode) {
        return strategies.get(mode);
    }
}
