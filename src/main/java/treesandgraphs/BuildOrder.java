package treesandgraphs;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BuildOrder {
    public static <T> T[] buildOrder(T[] projects, Pair<T, T>[] dependencies) {
        HashMap<T, ArrayList<T>> projectsToDependencies =
                buildProjectDependencyMap(projects, dependencies);
        ArrayList<T> buildOrder = new ArrayList<>();

        while (buildOrder.size() < projects.length) {
            int numAdded = 0;
            for (Map.Entry<T, ArrayList<T>> entry : projectsToDependencies.entrySet()) {
                if (!buildOrder.contains(entry.getKey()) && buildOrder.containsAll(entry.getValue())) {
                    buildOrder.add(entry.getKey());
                    numAdded++;
                }
            }
            if (numAdded == 0) return null;
        }
        return (T[]) buildOrder.toArray();
    }

    private static <T> HashMap<T, ArrayList<T>> buildProjectDependencyMap(
            T[] projects, Pair<T, T>[] dependencies) {
        HashMap<T, ArrayList<T>> projectsToDependencies = new HashMap<>();
        for (T project: projects) {
            projectsToDependencies.put(project, new ArrayList<>());
        }

        for (Pair<T, T> dependency: dependencies) {
            projectsToDependencies.get(dependency.getValue()).add(dependency.getKey());
        }
        return projectsToDependencies;
    }
}
