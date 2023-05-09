Public Class Calculator
    Private Sub One_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles One.Click
        TextBox1.AppendText("1")
    End Sub

    Private Sub Two_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Two.Click
        TextBox1.AppendText("2")
    End Sub

    Private Sub Three_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Three.Click
        TextBox1.AppendText("3")
    End Sub

    Private Sub Four_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Four.Click
        TextBox1.AppendText("4")
    End Sub

    Private Sub Five_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Five.Click
        TextBox1.AppendText("5")
    End Sub

    Private Sub Six_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Six.Click
        TextBox1.AppendText("6")
    End Sub

    Private Sub Seven_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Seven.Click
        TextBox1.AppendText("7")
    End Sub

    Private Sub Eight_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Eight.Click
        TextBox1.AppendText("8")
    End Sub

    Private Sub Nine_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Nine.Click
        TextBox1.AppendText("9")
    End Sub

    Private Sub Zero_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Zero.Click
        TextBox1.AppendText("0")
    End Sub

    Private Sub Addition_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Addition.Click
        Label1.Text = "+"
        My.Settings.first = TextBox1.Text
        TextBox1.Text = ""
        My.Settings.Save()
    End Sub

    Private Sub Subtraction_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Subtraction.Click
        Label1.Text = "-"
        My.Settings.first = TextBox1.Text
        TextBox1.Text = ""
        My.Settings.Save()
    End Sub

    Private Sub Division_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Division.Click
        Label1.Text = "/"
        My.Settings.first = TextBox1.Text
        TextBox1.Text = ""
        My.Settings.Save()
    End Sub

    Private Sub Multiplication_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Multiplication.Click
        Label1.Text = "*"
        My.Settings.first = TextBox1.Text
        TextBox1.Text = ""
        My.Settings.Save()
    End Sub

    Private Sub Equals_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Equals.Click
        If Label1.Text = "+" Then
            TextBox1.Text = Val(My.Settings.first) + Val(TextBox1.Text)
        ElseIf Label1.Text = "-" Then
            TextBox1.Text = Val(My.Settings.first) - Val(TextBox1.Text)
        ElseIf Label1.Text = "*" Then
            TextBox1.Text = Val(My.Settings.first) * Val(TextBox1.Text)
        ElseIf Label1.Text = "/" Then
            TextBox1.Text = Val(My.Settings.first) / Val(TextBox1.Text)
        End If
    End Sub

    Private Sub Clear_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Clear.Click
        TextBox1.Text = ""
    End Sub

    Private Sub TextBox1_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles TextBox1.TextChanged

    End Sub

    Private Sub Label1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Label1.Click

    End Sub
End Class
