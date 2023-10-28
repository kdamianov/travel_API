INSERT INTO country (name, country_code)
VALUES ('Romania', 'RO');
INSERT INTO country (name, country_code)
VALUES ('Bulgaria', 'BG');
INSERT INTO country (name, country_code)
VALUES ('Turkey', 'TR');
INSERT INTO country (name, country_code)
VALUES ('Greece', 'GR');
INSERT INTO country (name, country_code)
VALUES ('North Macedonia', 'MK');
INSERT INTO country (name, country_code)
VALUES ('Albania', 'AL');
INSERT INTO country (name, country_code)
VALUES ('Serbia', 'SR');

INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (1, 2);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (1, 7);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (2, 1);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (2, 3);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (2, 4);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (2, 5);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (2, 7);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (3, 2);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (3, 4);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (4, 2);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (4, 3);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (4, 5);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (4, 6);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (5, 2);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (5, 4);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (5, 6);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (5, 7);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (6, 4);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (6, 5);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (7, 1);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (7, 2);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (7, 5);
INSERT INTO country_neighbors (country_id, neighbor_id)
VALUES (7, 6);

INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate, country_id)
VALUES ('EUR', 'RON', 4.92, 1);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate, country_id)
VALUES ('EUR', 'BGN', 1.96, 2);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate, country_id)
VALUES ('EUR', 'TRY', 10.97, 3);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate, country_id)
VALUES ('EUR', 'EUR', 1, 4);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate, country_id)
VALUES ('EUR', 'MKD', 61.33, 5);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate, country_id)
VALUES ('EUR', 'ALL', 125.40, 6);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate, country_id)
VALUES ('EUR', 'RSD', 125.84, 7);

