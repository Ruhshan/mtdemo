CREATE TABLE app_user(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE address(
    id SERIAL PRIMARY KEY,
    details VARCHAR(255) NOT NULL,
    name varchar(100) NOT NULL,
    app_user_id INTEGER NOT NULL,
    FOREIGN KEY (app_user_id) REFERENCES app_user(id)
);