/**
 * Copyright 2015 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 **/

package io.confluent.connect.hdfs.errors;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@Deprecated
@SuppressWarnings("serial")
@SuppressFBWarnings("NM_SAME_SIMPLE_NAME_AS_SUPERCLASS")
public class HiveMetaStoreException
    extends io.confluent.connect.storage.errors.HiveMetaStoreException {

  public HiveMetaStoreException(String s) {
    super(s);
  }

  public HiveMetaStoreException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public HiveMetaStoreException(Throwable throwable) {
    super(throwable);
  }
}
