INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate)
VALUES ('EUR', 'RON', 4.92);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate)
VALUES ('EUR', 'BGN', 1.96);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate)
VALUES ('EUR', 'TRY', 10.97);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate)
VALUES ('EUR', 'EUR', 1);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate)
VALUES ('EUR', 'MKD', 61.33);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate)
VALUES ('EUR', 'ALL', 125.40);
INSERT INTO currency_exchange_rate (source_currency, target_currency, exchange_rate)
VALUES ('EUR', 'RSD', 125.84);

INSERT INTO country (name, country_code,currency_exchange_rate_id)
VALUES ('Romania', 'RO',1);
INSERT INTO country (name, country_code,currency_exchange_rate_id)
VALUES ('Bulgaria', 'BG',2);
INSERT INTO country (name, country_code,currency_exchange_rate_id)
VALUES ('Turkey', 'TR',3);
INSERT INTO country (name, country_code,currency_exchange_rate_id)
VALUES ('Greece', 'GR',4);
INSERT INTO country (name, country_code,currency_exchange_rate_id)
VALUES ('North Macedonia', 'MK',5);
INSERT INTO country (name, country_code,currency_exchange_rate_id)
VALUES ('Albania', 'AL',6);
INSERT INTO country (name, country_code,currency_exchange_rate_id)
VALUES ('Serbia', 'SR',7);

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



