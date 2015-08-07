package com.google.appinventor.client.explorer.project;

import java.util.List;
import java.util.Map;


/**
 * Listener interface for ComponentDatabase changes
 */
public interface ComponentDatabaseChangeListener {
  
  /**
   * Invoked after one or more components are added
   */
  void onComponentTypeAdded(List<String> componentTypes);

  /**
   * Invoked just before one or more components are removed <br>
   * Must Return true for successful removal of Component!
   */
  boolean beforeComponentTypeRemoved(List<String> componentTypes);

  /**
   * Invoked after one or more components are removed <br>
   * Invoked only after beforeComponentTypeRemoved returns true
   * Mapping from ComponentType to ComponentFullType
   */
  void onComponentTypeRemoved(Map<String, String> componentTypes);
  
  /**
   * Called when database is reset to contain only internal components
   */
  void onResetDatabase();
  
  
}
