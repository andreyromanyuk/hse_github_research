package hse_github_research.scripts.interactors

import hse_github_research.models.student.StudentCsvStartDatasetModel
import java.io.BufferedReader
import java.io.FileReader
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser

private const val DEFAULT_START_DATASET_FILE_NAME = "data/students.csv"

object ParseScvStartDatasetInteractor {

    fun parse(
        fileName: String = DEFAULT_START_DATASET_FILE_NAME
    ): List<StudentCsvStartDatasetModel> {
        val bufferedReader = BufferedReader(FileReader(fileName))
        val csvParser = CSVParser(bufferedReader, CSVFormat.newFormat(';'))

        return csvParser.drop(1).map { csvRecord ->
            StudentCsvStartDatasetModel(
                fio = csvRecord.get(0),
                firstName = csvRecord.get(1),
                secondName = csvRecord.get(2),
                thirdName = csvRecord.get(3),
                faculty = csvRecord.get(4),
                level = csvRecord.get(5),
                educationProgram = csvRecord.get(6),
                numberCourse = csvRecord.get(7),
                email = csvRecord.get(8),
                contactType = csvRecord.get(9),
            )
        }
    }
}
