// Create Data

curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/add-create-ops \
-u test@liferay.com:test \
-d description='Full%20Stack%20Developer' \
-d name='Farhaan'


// Read Data

curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/fetch-ops \
-u test@liferay.com:test \
-d Id=1684991095286



// Updata Data

curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/update-ops \
-u test@liferay.com:test


// Delete Data

curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/delete-ops \
-u test@liferay.com:test
