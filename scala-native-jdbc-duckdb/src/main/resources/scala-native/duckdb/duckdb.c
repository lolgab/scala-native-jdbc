#include <string.h>
#include "duckdb.h"

duckdb_data_chunk __sn_wrap_duckdb_duckdb_fetch_chunk(duckdb_result *result) {
 return duckdb_fetch_chunk(*result);
};

