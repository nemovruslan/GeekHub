package hw7;

/**
 * Created by Ruslan on 18.04.2017.
 */

import java.util.*;
import java.util.function.*;

public class CollectionUtils {

    public <E> List<E> filter(List<E> elements, Predicate<E> filter) {
        List<E> result = new ArrayList<>();
        for (E count : elements) {
            if (filter.test(count)) {
                result.add(count);
            }
        }
        return result;
    }

    public <E> boolean anyMatch(List<E> elements, Predicate<E> predicate) {
        for (E count : elements) {
            if (predicate.test(count)) {
                return true;
            }
        }
        return false;
    }

    public <E> boolean allMatch(List<E> elements, Predicate<E> predicate) {
        for (E count : elements) {
            if (!predicate.test(count)) {
                return false;
            }
        }
        return true;
    }

    public <T> boolean noneMatch(List<T> elements, Predicate<T> predicate) {
        return !anyMatch(elements, predicate);
    }

    public <T, R> List<R> map(List<T> elements, Function<T, R> mappingFunction) {
        List<R> result =  new ArrayList<>();
        for (T count : elements) {
            result.add(mappingFunction.apply(count));
        }
        return result;
    }

    public <E> Optional<E> max(List<E> elements, Comparator<E> comparator) {
        if (elements.isEmpty()) {
            return Optional.empty();
        }
        E max = elements.iterator().next();
        for (E count : elements) {
            if (comparator.compare(count, max) > 0) {
                max = count;
            }
        }
        return Optional.of(max);
    }

    public <E> Optional<E> min(List<E> elements, Comparator<E> comparator) {
        if (elements.isEmpty()) {
            return Optional.empty();
        }
        E min = elements.iterator().next();
        for (E count : elements) {
            if (comparator.compare(count, min) < 0) {
                min = count;
            }
        }
        return Optional.of(min);
    }

    public <E> List<E> distinct(List<E> elements) {
        List<E> result = new ArrayList<>();
        for (E count : elements) {
            if (!result.contains(count)) {
                result.add(count);
            }
        }
        return result;
    }

    public <E> void forEach(List<E> elements, Consumer<E> consumer) {
        for (E count : elements) {
            consumer.accept(count);
        }
    }

    public <E> Optional<E> reduce(List<E> elements, BinaryOperator<E> accumulator) {
        if (elements.isEmpty()) {
            return Optional.empty();
        }
        E result = null;
        for (E count : elements) {
            if (result == null) {
                result = count;
                continue;
            }
            result = accumulator.apply(result, count);
        }
        return Optional.of(result);
    }

    public <E> E reduce(E seed, List<E> elements, BinaryOperator<E> accumulator) {
        E result = seed;
        for (E count : elements) {
            result = accumulator.apply(result, count);
        }
        return result;
    }

    public <E> Map<Boolean, List<E>> partitionBy(List<E> elements, Predicate<E> predicate) {
        Map<Boolean, List<E>> result = new HashMap<>();
        result.put(Boolean.TRUE, new LinkedList<>());
        result.put(Boolean.FALSE, new LinkedList<>());
        for (E count : elements) {
            boolean group = predicate.test(count);
            result.get(group).add(count);
        }
        return result;
    }

    public <E, K> Map<K, List<E>> groupBy(List<E> elements, Function<E, K> classifier) {
        Map<K, List<E>> result = new HashMap<>();
        for (E count : elements) {
            K group = classifier.apply(count);
            List<E> groupList;
            if (!result.containsKey(group)) {
                groupList = new LinkedList<>();
                result.put(group, groupList);
            } else {
                groupList = result.get(group);
            }
            groupList.add(count);
        }
        return result;
    }

    public <T, K, V> Map<K, V> toMap(List<T> elements,
                                     Function<T, K> keyFunction,
                                     Function<T, V> valueFunction,
                                     BinaryOperator<V> mergeFunction) {
        Map<K, V> result = new HashMap<>();
        for (T count : elements) {
            K key = keyFunction.apply(count);
            V value = valueFunction.apply(count);
            V newValue;
            if (result.containsKey(key)) {
                V oldValue = result.get(key);
                newValue = mergeFunction.apply(oldValue, value);
            } else {
                newValue = value;
            }
            result.put(key, newValue);
        }
        return result;
    }
}