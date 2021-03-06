/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.hbase.adapters.filters;

import com.google.common.base.Preconditions;
import com.google.common.base.Joiner;

import java.util.List;

/**
 * An exception thrown when attempting to adapt unsupported filters.
 */
public class UnsupportedFilterException extends UnsupportedOperationException {
  /**
   * serialVersionUID generated by eclipse.
   */
  private static final long serialVersionUID = -8737704632500918999L;
  private static Joiner STATUS_JOINER = Joiner.on(", ");
  private final List<FilterSupportStatus> filterSupportStatuses;

  public UnsupportedFilterException(List<FilterSupportStatus> filterSupportStatuses) {
    super(String.format(
        "Unsupported filters encountered: %s",
        STATUS_JOINER.join(filterSupportStatuses)));
    Preconditions.checkArgument(
        !filterSupportStatuses.isEmpty(), "Unsupported statuses should not be empty.");
    this.filterSupportStatuses = filterSupportStatuses;
  }

  /**
   * The failed FilterSupportStatus instances containing reason messages.
   */
  public List<FilterSupportStatus> getFilterSupportStatuses() {
    return filterSupportStatuses;
  }
}
