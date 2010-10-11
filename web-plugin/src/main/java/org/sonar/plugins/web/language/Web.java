/*
 * Copyright (C) 2010 Matthijs Galesloot
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sonar.plugins.web.language;

import org.sonar.api.resources.AbstractLanguage;
import org.sonar.api.resources.Language;

/**
 * This class defines the Web language.
 * 
 * @author Matthijs Galesloot
 * @since 1.0
 */
public class Web extends AbstractLanguage {

  /** A web instance. */
  public static final Web INSTANCE = new Web();

  /** The web language key. */
  public static final String KEY = "web";

  /** All the valid web files suffixes. */
  private static final String[] SUFFIXES = { "xhtml", "jspf", "jsp" };

  /** The web language name */
  private static final String WEB_LANGUAGE_NAME = "Web";

  /**
   * Default constructor.
   */
  public Web() {
    super(KEY, WEB_LANGUAGE_NAME);
  }

  /**
   * Gets the file suffixes.
   * 
   * @return the file suffixes
   * @see org.sonar.api.resources.Language#getFileSuffixes()
   */
  public String[] getFileSuffixes() {
    return SUFFIXES;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Language) {
      Language language = (Language) o;
      return getKey().equals(language.getKey());
    }
    return false;
  }
}